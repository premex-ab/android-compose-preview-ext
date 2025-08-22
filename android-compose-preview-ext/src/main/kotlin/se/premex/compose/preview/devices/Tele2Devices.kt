package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tele2 device specifications for Android Compose previews.
 *
 * This extension provides Tele2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tele2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tele2: Any
  get() = object {
      /** Tele2 KSTB4231 */
      val KSTB4231 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tele2 SEI700TE */
      val SEI700TE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tele2 Tele2_Maxi */
      val TELE2_MAXI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Tele2 Tele2_Maxi_Plus */
      val TELE2_MAXI_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Tele2 Tele2_Midi_2_0 */
      val TELE2_MIDI_2_0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Tele2 Tele2_Mini */
      val TELE2_MINI = "spec:width=480,height=800,unit=px,dpi=240"

  }
