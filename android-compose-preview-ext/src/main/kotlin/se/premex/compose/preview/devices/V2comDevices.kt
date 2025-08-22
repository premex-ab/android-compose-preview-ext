package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * V2com device specifications for Android Compose previews.
 *
 * This extension provides V2com device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.V2com.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.V2com: Any
  get() = object {
      /** V2com ROCKY_T2 */
      val ROCKY_T2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
