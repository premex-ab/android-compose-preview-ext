package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * THANHHUNG_TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides THANHHUNG_TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ThanhhungTechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ThanhhungTechnology: Any
  get() = object {
      /** THANHHUNG_TECHNOLOGY HERO_9 */
      val HERO_9 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
