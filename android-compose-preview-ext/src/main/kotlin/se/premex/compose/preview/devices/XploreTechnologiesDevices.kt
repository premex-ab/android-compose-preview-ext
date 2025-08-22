package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Xplore_Technologies device specifications for Android Compose previews.
 *
 * This extension provides Xplore_Technologies device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XploreTechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XploreTechnologies: Any
  get() = object {
      /** Xplore_Technologies XSLATE_D10 */
      val XSLATE_D10 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
