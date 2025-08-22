package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ooredoo device specifications for Android Compose previews.
 *
 * This extension provides Ooredoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ooredoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ooredoo: Any
  get() = object {
      /** Ooredoo diw387oor */
      val DIW387OOR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
