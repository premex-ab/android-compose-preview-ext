package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ONERugged device specifications for Android Compose previews.
 *
 * This extension provides ONERugged device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onerugged.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onerugged: Any
  get() = object {
      /** ONERugged M185QE */
      val M185QE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ONERugged M86XE */
      val M86XE = "spec:width=1200,height=1920,unit=px,dpi=321"

      /** ONERugged MP1T */
      val MP1T = "spec:width=720,height=1612,unit=px,dpi=360"

      /** ONERugged MPC80T */
      val MPC80T = "spec:width=800,height=1280,unit=px,dpi=213"

  }
