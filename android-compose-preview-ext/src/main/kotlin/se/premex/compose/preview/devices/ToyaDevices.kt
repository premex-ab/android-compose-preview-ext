package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TOYA device specifications for Android Compose previews.
 *
 * This extension provides TOYA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Toya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Toya: Any
  get() = object {
      /** TOYA DTC974x */
      val DTC974X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TOYA DTC974y */
      val DTC974Y = "spec:width=720,height=1280,unit=px,dpi=320"

  }
