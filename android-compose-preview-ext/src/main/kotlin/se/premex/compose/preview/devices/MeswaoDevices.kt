package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Meswao device specifications for Android Compose previews.
 *
 * This extension provides Meswao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meswao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meswao: Any
  get() = object {
      /** Meswao MES-B3 */
      val MES_B3 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
