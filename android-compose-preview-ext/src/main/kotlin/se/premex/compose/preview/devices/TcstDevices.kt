package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TCST device specifications for Android Compose previews.
 *
 * This extension provides TCST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tcst.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tcst: Any
  get() = object {
      /** TCST L7 */
      val L7 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
