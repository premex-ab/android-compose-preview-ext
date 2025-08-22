package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DTAC device specifications for Android Compose previews.
 *
 * This extension provides DTAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dtac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dtac: Any
  get() = object {
      /** DTAC dtacPhoneS3 */
      val DTACPHONES3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DTAC dtacPhoneT3 */
      val DTACPHONET3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DTAC dtacPhoneX3 */
      val DTACPHONEX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
