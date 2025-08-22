package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZENOS device specifications for Android Compose previews.
 *
 * This extension provides ZENOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zenos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zenos: Any
  get() = object {
      /** ZENOS kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
