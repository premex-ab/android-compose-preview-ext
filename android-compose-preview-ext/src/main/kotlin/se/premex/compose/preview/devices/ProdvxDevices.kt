package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ProDVX device specifications for Android Compose previews.
 *
 * This extension provides ProDVX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prodvx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prodvx: Any
  get() = object {
      /** ProDVX rk3399_Android11 */
      val RK3399_ANDROID11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
