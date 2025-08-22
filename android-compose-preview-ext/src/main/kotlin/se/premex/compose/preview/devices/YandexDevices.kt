package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Yandex device specifications for Android Compose previews.
 *
 * This extension provides Yandex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yandex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yandex: Any
  get() = object {
      /** Yandex Amber */
      val AMBER = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
