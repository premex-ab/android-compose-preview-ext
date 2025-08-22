package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ecostar device specifications for Android Compose previews.
 *
 * This extension provides Ecostar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ecostar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ecostar: Any
  get() = object {
      /** Ecostar shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
