package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * huawei device specifications for Android Compose previews.
 *
 * This extension provides huawei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huawei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huawei: Any
  get() = object {
      /** huawei sawfish */
      val SAWFISH = "spec:width=390,height=390,unit=px,dpi=320"

      /** huawei sawshark */
      val SAWSHARK = "spec:width=390,height=390,unit=px,dpi=320"

  }
