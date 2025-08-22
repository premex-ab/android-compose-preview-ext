package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Soymomo device specifications for Android Compose previews.
 *
 * This extension provides Soymomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soymomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soymomo: Any
  get() = object {
      /** Soymomo SoyMomo_Lite_V1 */
      val SOYMOMO_LITE_V1 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
