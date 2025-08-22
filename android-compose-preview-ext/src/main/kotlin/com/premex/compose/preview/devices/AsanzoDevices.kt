package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASANZO device specifications for Android Compose previews.
 *
 * This extension provides ASANZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asanzo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asanzo: Any
  get() = object {
      /** ASANZO ASANZO_A2 */
      val ASANZO_A2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ASANZO S6 */
      val S6 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** ASANZO shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ASANZO SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
