package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISION-TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides VISION-TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VISIONTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VISIONTECHNOLOGY: Any
  get() = object {
      /** VISION-TECHNOLOGY R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VISION-TECHNOLOGY R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VISION-TECHNOLOGY R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
