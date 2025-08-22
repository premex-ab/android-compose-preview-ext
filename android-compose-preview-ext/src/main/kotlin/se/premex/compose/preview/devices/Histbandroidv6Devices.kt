package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HiSTBAndroidV6 device specifications for Android Compose previews.
 *
 * This extension provides HiSTBAndroidV6 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Histbandroidv6.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Histbandroidv6: Any
  get() = object {
      /** HiSTBAndroidV6 Hi3798MV200 */
      val HI3798MV200 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
