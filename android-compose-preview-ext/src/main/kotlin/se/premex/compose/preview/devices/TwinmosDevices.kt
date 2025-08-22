package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TWINMOS device specifications for Android Compose previews.
 *
 * This extension provides TWINMOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Twinmos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Twinmos: Any
  get() = object {
      /** TWINMOS MQ703G */
      val MQ703G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
