package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VOO device specifications for Android Compose previews.
 *
 * This extension provides VOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Voo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Voo: Any
  get() = object {
      /** VOO DV8220 */
      val DV8220 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
