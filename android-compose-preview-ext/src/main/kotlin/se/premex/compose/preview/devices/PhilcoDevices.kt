package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Philco device specifications for Android Compose previews.
 *
 * This extension provides Philco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Philco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Philco: Any
  get() = object {
      /** Philco anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Philco Hit_Max */
      val HIT_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Philco Hit_P10 */
      val HIT_P10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Philco HIT_P10a */
      val HIT_P10A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Philco Hit_P12 */
      val HIT_P12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Philco Hit_P13 */
      val HIT_P13 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Philco HIT_P8 */
      val HIT_P8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Philco ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Philco PCS01 */
      val PCS01 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Philco PCS02 */
      val PCS02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Philco PTB7PA */
      val PTB7PA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Philco PTB7QSG_3G */
      val PTB7QSG_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Philco PTB7R */
      val PTB7R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Philco shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Philco sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Philco sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Philco SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
