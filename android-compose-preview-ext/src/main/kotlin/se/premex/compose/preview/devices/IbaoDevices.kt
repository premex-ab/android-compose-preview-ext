package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iBao device specifications for Android Compose previews.
 *
 * This extension provides iBao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ibao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ibao: Any
  get() = object {
      /** iBao iS1 */
      val IS1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
