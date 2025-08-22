package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Stylo device specifications for Android Compose previews.
 *
 * This extension provides Stylo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stylo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stylo: Any
  get() = object {
      /** Stylo Quantum */
      val QUANTUM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Stylo S501 */
      val S501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Stylo Sirius_Plus_Tab_10 */
      val SIRIUS_PLUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Stylo Stylo_521 */
      val STYLO_521 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
