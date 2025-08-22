package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * npls device specifications for Android Compose previews.
 *
 * This extension provides npls device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Npls.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Npls: Any
  get() = object {
      /** npls uzx4020nps */
      val UZX4020NPS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
