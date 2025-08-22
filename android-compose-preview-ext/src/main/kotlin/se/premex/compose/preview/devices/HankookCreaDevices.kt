package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HANKOOK_CREA device specifications for Android Compose previews.
 *
 * This extension provides HANKOOK_CREA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HankookCrea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HankookCrea: Any
  get() = object {
      /** HANKOOK_CREA HANKOOK_CREA_RK3588 */
      val HANKOOK_CREA_RK3588 = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
