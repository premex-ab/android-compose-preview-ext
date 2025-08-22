package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KT device specifications for Android Compose previews.
 *
 * This extension provides KT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KT: Any
  get() = object {
      /** KT KG2100 */
      val KG2100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT KG3100 */
      val KG3100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT KG4100 */
      val KG4100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT KI1101 */
      val KI1101 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT KSTB6188 */
      val KSTB6188 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT MA4000 */
      val MA4000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT MA4100 */
      val MA4100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT MAR4510C */
      val MAR4510C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KT mau4800d */
      val MAU4800D = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
