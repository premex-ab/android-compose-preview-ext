package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PHOENIX device specifications for Android Compose previews.
 *
 * This extension provides PHOENIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Phoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Phoenix: Any
  get() = object {
      /** PHOENIX PHPHOENIXONETAB */
      val PHPHOENIXONETAB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
