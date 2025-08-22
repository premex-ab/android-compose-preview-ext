package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COOKIE device specifications for Android Compose previews.
 *
 * This extension provides COOKIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cookie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cookie: Any
  get() = object {
      /** COOKIE YS-CK0001 */
      val YS_CK0001 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
