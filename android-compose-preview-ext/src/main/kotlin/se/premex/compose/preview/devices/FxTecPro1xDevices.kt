package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fx_tec_Pro1X device specifications for Android Compose previews.
 *
 * This extension provides Fx_tec_Pro1X device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FxTecPro1x.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FxTecPro1x: Any
  get() = object {
      /** Fx_tec_Pro1X QX1050 */
      val QX1050 = "spec:width=1440,height=2960,unit=px,dpi=440"

  }
