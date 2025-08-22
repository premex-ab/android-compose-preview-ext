package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Pixus device specifications for Android Compose previews.
 *
 * This extension provides Pixus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pixus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pixus: Any
  get() = object {
      /** Pixus Pixus_Arena */
      val PIXUS_ARENA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Pixus Pixus_Blast */
      val PIXUS_BLAST = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Pixus Pixus_Combo */
      val PIXUS_COMBO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Pixus Pixus_Deon */
      val PIXUS_DEON = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Pixus Pixus_Drive */
      val PIXUS_DRIVE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Pixus Pixus_Falcon */
      val PIXUS_FALCON = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Pixus Pixus_Folio */
      val PIXUS_FOLIO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Pixus Pixus_Hammer */
      val PIXUS_HAMMER = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Pixus Pixus_Joker */
      val PIXUS_JOKER = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Pixus Pixus_Line */
      val PIXUS_LINE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Pixus Pixus_Loga */
      val PIXUS_LOGA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Pixus Pixus_Titan */
      val PIXUS_TITAN = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Pixus Pixus_Touch_7_3G */
      val PIXUS_TOUCH_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Pixus Pixus_Wing */
      val PIXUS_WING = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Pixus Sprint */
      val SPRINT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Pixus Sprint_2_16 */
      val SPRINT_2_16 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
