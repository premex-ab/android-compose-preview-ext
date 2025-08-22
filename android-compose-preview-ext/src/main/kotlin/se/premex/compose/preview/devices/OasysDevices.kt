package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Oasys device specifications for Android Compose previews.
 *
 * This extension provides Oasys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oasys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oasys: Any
  get() = object {
      /** Oasys TEG9300 */
      val TEG9300 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
