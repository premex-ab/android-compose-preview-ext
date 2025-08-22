package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PROSCAN_ELITE device specifications for Android Compose previews.
 *
 * This extension provides PROSCAN_ELITE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ProscanElite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ProscanElite: Any
  get() = object {
      /** PROSCAN_ELITE mdt1008_mr_32 */
      val MDT1008_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
