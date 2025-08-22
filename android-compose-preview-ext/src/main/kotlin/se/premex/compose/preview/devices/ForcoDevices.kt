package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FORCO device specifications for Android Compose previews.
 *
 * This extension provides FORCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Forco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Forco: Any
  get() = object {
      /** FORCO K1028G */
      val K1028G = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
