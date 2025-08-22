package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TESPRO device specifications for Android Compose previews.
 *
 * This extension provides TESPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tespro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tespro: Any
  get() = object {
      /** TESPRO Mayumi_U1 */
      val MAYUMI_U1 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
