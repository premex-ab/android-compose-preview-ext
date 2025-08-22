package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Relndoo device specifications for Android Compose previews.
 *
 * This extension provides Relndoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Relndoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Relndoo: Any
  get() = object {
      /** Relndoo P60_EEA */
      val P60_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Relndoo P60_ROW */
      val P60_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Relndoo P60_US */
      val P60_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo P80 */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo P80_EU */
      val P80_EU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo P80_US */
      val P80_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T10P */
      val T10P = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T10P_A */
      val T10P_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Relndoo T10P_ROW */
      val T10P_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Relndoo T618 */
      val T618 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T618_US */
      val T618_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T618_WIFI */
      val T618_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T618_WIFI_EEA */
      val T618_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Relndoo T88 */
      val T88 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Relndoo TAB10_EU */
      val TAB10_EU = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Relndoo TAB10_EUR */
      val TAB10_EUR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Relndoo TB02 */
      val TB02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Relndoo TB02_EUR */
      val TB02_EUR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Relndoo TB02_ROW */
      val TB02_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

  }
