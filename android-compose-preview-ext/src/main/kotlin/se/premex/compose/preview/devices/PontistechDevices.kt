package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PontisTech device specifications for Android Compose previews.
 *
 * This extension provides PontisTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pontistech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pontistech: Any
  get() = object {
      /** PontisTech SEI700PTS */
      val SEI700PTS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
