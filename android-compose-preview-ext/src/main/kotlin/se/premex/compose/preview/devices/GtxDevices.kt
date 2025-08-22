package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GTX device specifications for Android Compose previews.
 *
 * This extension provides GTX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gtx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gtx: Any
  get() = object {
      /** GTX GTX_JACULUS */
      val GTX_JACULUS = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** GTX GTX_JACULUS_01 */
      val GTX_JACULUS_01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** GTX Jaculus_V2 */
      val JACULUS_V2 = "spec:width=1200,height=1920,unit=px,dpi=260"

  }
