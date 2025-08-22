package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TECHcomputer device specifications for Android Compose previews.
 *
 * This extension provides TECHcomputer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Techcomputer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Techcomputer: Any
  get() = object {
      /** TECHcomputer F102-T610-EEA */
      val F102_T610_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** TECHcomputer F102-T610-EEA-GG5 */
      val F102_T610_EEA_GG5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** TECHcomputer F102-T618-EEA */
      val F102_T618_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
