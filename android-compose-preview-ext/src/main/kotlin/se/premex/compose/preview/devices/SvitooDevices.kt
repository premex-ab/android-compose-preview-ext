package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SVITOO device specifications for Android Compose previews.
 *
 * This extension provides SVITOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Svitoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Svitoo: Any
  get() = object {
      /** SVITOO P08 */
      val P08 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** SVITOO P10 */
      val P10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** SVITOO P11 */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SVITOO P11_pro_EEA */
      val P11_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SVITOO SVITOO_P10 */
      val SVITOO_P10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** SVITOO TAB_P12 */
      val TAB_P12 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
