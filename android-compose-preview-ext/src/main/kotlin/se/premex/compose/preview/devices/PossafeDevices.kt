package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * POSSAFE device specifications for Android Compose previews.
 *
 * This extension provides POSSAFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Possafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Possafe: Any
  get() = object {
      /** POSSAFE OrderGo5 */
      val ORDERGO5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** POSSAFE OrderGo_6 */
      val ORDERGO_6 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
