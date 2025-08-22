package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vastking device specifications for Android Compose previews.
 *
 * This extension provides Vastking device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vastking.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vastking: Any
  get() = object {
      /** Vastking KindPad_SA8_EEA */
      val KINDPAD_SA8_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Vastking KingPad_K10 */
      val KINGPAD_K10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vastking KingPad_K10Pro */
      val KINGPAD_K10PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vastking KingPad_K10Pro_EEA */
      val KINGPAD_K10PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vastking KingPad_K10_EEA */
      val KINGPAD_K10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vastking KingPad_M10 */
      val KINGPAD_M10 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Vastking KingPad_M10_EEA */
      val KINGPAD_M10_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Vastking KingPad_SA10 */
      val KINGPAD_SA10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Vastking KingPad_SA10_EEA */
      val KINGPAD_SA10_EEA = "spec:width=720,height=1280,unit=px,dpi=240"

      /** Vastking KingPad_SA8 */
      val KINGPAD_SA8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Vastking KingPad_Z10 */
      val KINGPAD_Z10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vastking KingPad_Z10_EEA */
      val KINGPAD_Z10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
