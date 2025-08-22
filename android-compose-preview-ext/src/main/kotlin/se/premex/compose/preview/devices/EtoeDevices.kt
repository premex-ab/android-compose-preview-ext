package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ETOE device specifications for Android Compose previews.
 *
 * This extension provides ETOE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Etoe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Etoe: Any
  get() = object {
      /** ETOE XNA */
      val XNA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ETOE YUL */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
