package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELEVATE device specifications for Android Compose previews.
 *
 * This extension provides ELEVATE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELEVATE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELEVATE: Any
  get() = object {
      /** ELEVATE G5 */
      val G5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ELEVATE G55_LITE */
      val G55_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ELEVATE G58 */
      val G58 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ELEVATE G60 */
      val G60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ELEVATE G60X */
      val G60X = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** ELEVATE G62 */
      val G62 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** ELEVATE LUNA_G50 */
      val LUNA_G50 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ELEVATE V55 */
      val V55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ELEVATE V55C */
      val V55C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ELEVATE V57 */
      val V57 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
