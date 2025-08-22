package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SUAAT device specifications for Android Compose previews.
 *
 * This extension provides SUAAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Suaat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Suaat: Any
  get() = object {
      /** SUAAT S10_U_EEA */
      val S10_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUAAT S10_U_US */
      val S10_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUAAT S3_EEA */
      val S3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUAAT S3_US */
      val S3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUAAT S6_EEA */
      val S6_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SUAAT S6_US */
      val S6_US = "spec:width=800,height=1280,unit=px,dpi=200"

  }
