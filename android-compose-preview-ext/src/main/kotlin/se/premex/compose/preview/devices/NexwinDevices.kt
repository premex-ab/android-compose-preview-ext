package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NEXWIN device specifications for Android Compose previews.
 *
 * This extension provides NEXWIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nexwin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nexwin: Any
  get() = object {
      /** NEXWIN IFPD_RK3588 */
      val IFPD_RK3588 = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
