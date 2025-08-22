package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WS device specifications for Android Compose previews.
 *
 * This extension provides WS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ws.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ws: Any
  get() = object {
      /** WS TD-TP010G-2 */
      val TD_TP010G_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WS WS-T01 */
      val WS_T01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
