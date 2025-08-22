package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CignalPlayTV device specifications for Android Compose previews.
 *
 * This extension provides CignalPlayTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cignalplaytv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cignalplaytv: Any
  get() = object {
      /** CignalPlayTV CIGSEI100 */
      val CIGSEI100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
