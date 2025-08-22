package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ELECTRA device specifications for Android Compose previews.
 *
 * This extension provides ELECTRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Electra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Electra: Any
  get() = object {
      /** ELECTRA elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
