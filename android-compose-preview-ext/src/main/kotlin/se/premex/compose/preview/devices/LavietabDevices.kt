package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LaVieTab device specifications for Android Compose previews.
 *
 * This extension provides LaVieTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lavietab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lavietab: Any
  get() = object {
      /** LaVieTab PC-TE307N1W */
      val PC_TE307N1W = "spec:width=600,height=976,unit=px,dpi=160"

      /** LaVieTab PC-TE510BAL */
      val PC_TE510BAL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** LaVieTab TE508BAW */
      val TE508BAW = "spec:width=800,height=1280,unit=px,dpi=213"

  }
