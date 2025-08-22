package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eSTREAM4K device specifications for Android Compose previews.
 *
 * This extension provides eSTREAM4K device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ESTREAM4K.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ESTREAM4K: Any
  get() = object {
      /** DeviceSpec(manufacturer=eSTREAM4K, code=kunlun, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=kunlun, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KUNLUN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI400TV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI400TV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI400TV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500ABB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500ABB,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500ABB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500AS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500AS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500AS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500BR, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500BR,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500BR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500BS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500BS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500BS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500CB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500CB,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500CB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500L, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500L,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500L = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500MC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500MC,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500MC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500MN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500MN,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500MN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500RCN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500RCN,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500RCN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500SECV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500SECV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500SECV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500TDS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500TDS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500TDS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTREAM4K, code=SEI500TV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTREAM4K, code=SEI500TV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500TV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
