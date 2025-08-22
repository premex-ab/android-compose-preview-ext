package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MINT device specifications for Android Compose previews.
 *
 * This extension provides MINT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mint: Any
  get() = object {
      /** MINT M5CR */
      val M5CR = "spec:width=480,height=854,unit=px,dpi=240"

      /** MINT Mint_Fox */
      val MINT_FOX = "spec:width=320,height=480,unit=px,dpi=160"

      /** MINT Mint_Fusion */
      val MINT_FUSION = "spec:width=480,height=960,unit=px,dpi=240"

      /** MINT Pearl_Neo */
      val PEARL_NEO = "spec:width=480,height=854,unit=px,dpi=240"

  }
