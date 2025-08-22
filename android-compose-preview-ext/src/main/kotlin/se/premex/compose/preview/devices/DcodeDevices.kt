package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dcode device specifications for Android Compose previews.
 *
 * This extension provides Dcode device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dcode.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dcode: Any
  get() = object {
      /** Dcode Dcode_Cypher */
      val DCODE_CYPHER = "spec:width=720,height=1600,unit=px,dpi=320"

  }
