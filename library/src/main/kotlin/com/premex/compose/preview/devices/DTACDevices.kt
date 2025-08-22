package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DTAC device specifications for Android Compose previews.
 *
 * This extension provides DTAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTAC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTAC: Any
  get() = object {
      /** DTAC dtacPhoneS3 */
      val DTACPHONES3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DTAC dtacPhoneT3 */
      val DTACPHONET3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DTAC dtacPhoneX3 */
      val DTACPHONEX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
