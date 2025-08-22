package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WISHTEL device specifications for Android Compose previews.
 *
 * This extension provides WISHTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wishtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wishtel: Any
  get() = object {
      /** WISHTEL IRA_S1 */
      val IRA_S1 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
