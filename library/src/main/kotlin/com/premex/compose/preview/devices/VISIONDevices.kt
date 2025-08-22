package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISION device specifications for Android Compose previews.
 *
 * This extension provides VISION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VISION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VISION: Any
  get() = object {
      /** VISION B866V2F */
      val B866V2F = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VISION MediaBox_B866V2 */
      val MEDIABOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** VISION nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VISION SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VISION SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** VISION umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VISION VISION_V1 */
      val VISION_V1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
